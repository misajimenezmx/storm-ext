// use an integer for version numbers
version = 8


cloudstream {
    language = "en"
    // All of these properties are optional, you can safely remove them
     description = "Webview is used to load links, reload if necessary"
     authors = listOf("Stormunblessed")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 0 // will be 3 if unspecified


    iconUrl = "https://www.google.com/s2/favicons?domain=bflix.ru&sz=%size%"
}