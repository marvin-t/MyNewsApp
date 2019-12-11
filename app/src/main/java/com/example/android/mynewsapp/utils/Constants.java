package com.example.android.mynewsapp.utils;

/**
 * Inspired by the Udacity Android Basics by Google Nanodegree Program Course
 * Material as well as Soojeong Shin. This code is mostly copied and modified for the
 * 6th and final project.
 * ~ Marvin Tittleton
 */

/**
 * Store Constants for the MyNewsApp app.
 */

public class Constants {

    /**
     * Create a private constructor because no one should ever create a {@link Constants} object.
     */
    private Constants() {
    }

    /**  Extract the key associated with the JSONObject */
    static final String JSON_KEY_RESPONSE = "response";
    static final String JSON_KEY_RESULTS = "results";
    static final String JSON_KEY_WEB_TITLE = "webTitle";
    static final String JSON_KEY_SECTION_NAME = "sectionName";
    static final String JSON_KEY_WEB_PUBLICATION_DATE = "webPublicationDate";
    static final String JSON_KEY_WEB_URL = "webUrl";
    static final String JSON_KEY_TAGS = "tags";
    static final String JSON_KEY_FIELDS = "fields";
    static final String JSON_KEY_THUMBNAIL = "thumbnail";
    static final String JSON_KEY_BODY_TEXT = "bodyText";

    /** Read timeout for setting up the HTTP request */
    static final int READ_TIMEOUT = 10000; /* milliseconds */

    /** Connect timeout for setting up the HTTP request */
    static final int CONNECT_TIMEOUT = 15000; /* milliseconds */

    /** HTTP response code when the request is successful */
    static final int SUCCESS_RESPONSE_CODE = 200;

    /** Request method type "GET" for reading information from the server */
    static final String REQUEST_METHOD_GET = "GET";

    /** URL for news data from the guardian data set */
    public static final String NEWS_REQUEST_URL = "https://content.guardianapis.com/search";

    /** Parameters */
    public static final String QUERY_PARAM = "q";
    public static final String ORDER_BY_PARAM = "order-by";
    public static final String PAGE_SIZE_PARAM = "page-size";
    public static final String ORDER_DATE_PARAM = "order-date";
    public static final String FROM_DATE_PARAM = "from-date";
    public static final String SHOW_FIELDS_PARAM = "show-fields";
    public static final String FORMAT_PARAM = "format";
    public static final String SHOW_TAGS_PARAM = "show-tags";
    public static final String API_KEY_PARAM = "api-key";
    public static final String SECTION_PARAM = "section";

    /** The show fields we want our API to return */
    public static final String SHOW_FIELDS = "thumbnail,bodyText";

    /** The format we want our API to return */
    public static final String FORMAT = "json";

    /** The show tags we want our API to return */
    public static final String SHOW_TAGS = "contributor";

    /** API Key */
    public static final String API_KEY = "3fc19a77-4b41-4527-878c-33c258721277"; // Use your API Key when API rate limit exceeded

    /** Default number to set the image on the top of the textView */
    public static final int DEFAULT_NUMBER = 0;

    /** Constants value for each fragment */
    public static final int BREAKINGNEWS = 0;
    public static final int WORLDNEWS = 1;

}