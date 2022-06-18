package com.example.netflixclone.models


// To parse the JSON, install kotlin's serialization plugin and do:
//
// val json        = Json(JsonConfiguration.Stable)
// val trendingAll = json.parse(TrendingAll.serializer(), jsonString)



import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

@Serializable
data class TrendingAll (
    val page: Long,
    val results: List<Result>,

    @SerialName("total_pages")
    val totalPages: Long,

    @SerialName("total_results")
    val totalResults: Long
)

@Serializable
data class Result (
    val adult: Boolean? = null,

    @SerialName("backdrop_path")
    val backdropPath: String,

    @SerialName("genre_ids")
    val genreIDS: List<Long>,

    val id: Long,

    @SerialName("original_language")
    val originalLanguage: OriginalLanguage,

    @SerialName("original_title")
    val originalTitle: String? = null,

    val overview: String,

    @SerialName("poster_path")
    val posterPath: String,

    @SerialName("release_date")
    val releaseDate: String? = null,

    val title: String? = null,
    val video: Boolean? = null,

    @SerialName("vote_average")
    val voteAverage: Double,

    @SerialName("vote_count")
    val voteCount: Long,

    val popularity: Double,

    @SerialName("first_air_date")
    val firstAirDate: String? = null,

    val name: String? = null,

    @SerialName("origin_country")
    val originCountry: List<String>? = null,

    @SerialName("original_name")
    val originalName: String? = null
)

@Serializable
enum class OriginalLanguage(val value: String) {
    En("en"),
    Zh("zh");

    companion object : KSerializer<OriginalLanguage> {
        override val descriptor: SerialDescriptor get() {
            return PrimitiveSerialDescriptor("quicktype.OriginalLanguage", PrimitiveKind.STRING)
        }
        override fun deserialize(decoder: Decoder): OriginalLanguage = when (val value = decoder.decodeString()) {
            "en" -> En
            "zh" -> Zh
            else -> throw IllegalArgumentException("OriginalLanguage could not parse: $value")
        }
        override fun serialize(encoder: Encoder, value: OriginalLanguage) {
            return encoder.encodeString(value.value)
        }
    }
}
