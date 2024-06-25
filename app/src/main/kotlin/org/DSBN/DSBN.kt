import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException

fun main() {
    val client = OkHttpClient()

    val request = Request.Builder()
        .url("https://google.com")
        .build()

    client.newCall(request).execute().use { response ->
        if (!response.isSuccessful) throw IOException("wtf nigga!")

        println(response.body!!.string())
    }
}