import okhttp3.Headers.Companion.toHeaders
import kotlinx.cli.*
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
val ANSI_BLUE = "\u001B[34m"
val ANSI_RESET = "\u001B[0m"

fun main() {
    start()
}

fun start() {
    println("""${ANSI_BLUE}          
                                    
                                  ██████╗████████╗███████╗██╗     ██╗      █████╗ ██████╗ 
                                 ██╔════╝╚══██╔══╝██╔════╝██║     ██║     ██╔══██╗██╔══██╗
                                 ╚█████╗    ██║   █████╗  ██║     ██║     ███████║██████╔╝
                                  ╚═══██╗   ██║   ██╔══╝  ██║     ██║     ██╔══██║██╔══██╗
                                 ██████╔╝   ██║   ███████╗███████╗███████╗██║  ██║██║  ██║
                                 ╚═════╝    ╚═╝   ╚══════╝╚══════╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝ x     
                                                                   
 > {white}developed by @swedewtf, @rinfy64,                                                        {white}Educational purposes only{blue} <  
 > {white}({blue}DSC{white}){blue} Discord.gg/stellarx                                                                           {white}({blue}placeholder{white}){blue} <
 > {white}({blue}?{white}){blue} Feature Description                                                                  {white}({blue}current version: {version}{white}){blue} <     
╔═══════════════════════════════════════╦═══════════════════════════════════╦════════════════════════════════════════╗
║     {white}({blue}01{white}){blue} > Webhook Control            ║     {white}({blue}07{white}){blue} > block all friends      ║     {white}({blue}13{white}){blue} > Token Login                 ║
║     {white}({blue}02{white}){blue} > Profile control            ║     {white}({blue}08{white}){blue} > mass DM all friends    ║     {white}({blue}14{white}){blue} > Token management            ║
║     {white}({blue}03{white}){blue} > Guild name changer         ║     {white}({blue}09{white}){blue} > Nitro generator        ║     {white}({blue}15{white}){blue} > Token Profile changer       ║
║     {white}({blue}04{white}){blue} > Stellar-ify profile >_<    ║     {white}({blue}10{white}){blue} > Vanity url sniper      ║     {white}({blue}16{white}){blue} > Token server joiner         ║
║     {white}({blue}05{white}){blue} > Mass report account        ║     {white}({blue}11{white}){blue} > Token validator        ║     {white}({blue}17{white}){blue} > Token server raider         ║
║     {white}({blue}06{white}){blue} > Account nuker              ║     {white}({blue}12{white}){blue} > Account info           ║     {white}({blue}18{white}){blue} > Next Page                   ║
╚═══════════════════════════════════════╩═══════════════════════════════════╩════════════════════════════════════════╝
""")
}

fun ashitwebhookspammer() {
    val headers = mapOf("Content-Type" to "application/json")
    val json = JSONObject()
    json.put("content", "<@614083620998479897>")
    val mediaType = "application/json; charset=utf-8".toMediaType()
    val requestBody = json.toString().toRequestBody(mediaType)
    val request = Request.Builder().url("https://discord.com/api/webhooks/1255679322023395491/lID9SoCGqSg3mprxZByRaX4CPwUjQGS74PalTvllgv5s117to7rqfPPUixd9ytHws4yX").post(requestBody).build()

    client.newCall(request).execute().use { response ->
        if (!response.isSuccessful) throw IOException("failed :( : $response")

        println(response.body!!.string())
    }
}