import okhttp3.Headers.Companion.toHeaders
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import java.io.IOException

val client = OkHttpClient()
val token = "Your_Token_Here"
val guildId = "Your_Guild_ID_Here"

fun main() {
    for (i in 0..10) {
        quicktest()
    }
}

fun quicktest() {
    val headers = mapOf(
        "Content-Type" to "application/json"
    )
    val json = JSONObject()
    json.put("content", "<@614083620998479897>")
    val mediaType = "application/json; charset=utf-8".toMediaType()
    val requestBody = json.toString().toRequestBody(mediaType)
    val request = Request.Builder()
        .url("https://discord.com/api/webhooks/1255679322023395491/lID9SoCGqSg3mprxZByRaX4CPwUjQGS74PalTvllgv5s117to7rqfPPUixd9ytHws4yX")
        .post(requestBody)
        .build()

    client.newCall(request).execute().use { response ->
        if (!response.isSuccessful) throw IOException("failed :( : $response")

        println(response.body!!.string())
    }
}