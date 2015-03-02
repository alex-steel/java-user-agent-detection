package net.pieroxy.ua.detection;
import java.io.*;
import java.util.*;
/**
* Describes the family of the bot, its nature.
*/
public enum BotFamily {  /**
  * A generic robot.
  */
    ROBOT("Robot",false),
    /**
    * A spam bot.
    */
    SPAMBOT("Spam bot",true ),
    /**
    * A robot used to crawl the web (Google's crawler, Bing's crawler, etc.)
    */
    CRAWLER("Web Crawler",false ),
    /**
    * Feed aggregator (Feedly, ...)
    */
    FEED_CRAWLER("Feed aggregator",false ),
    /**
    * Unknown type of bot
    */
    UNKNOWN("",false);

    private boolean nefarious;
    private String label;
BotFamily(String _label, boolean _bad) {
    nefarious=_bad;
    label = _label;
}

/**
* @return true if the bot is of the nefarious type.
*/
public boolean isNefarious() {
    return nefarious;
}
/**
* @return the text-based description of this bot.
*/
public String getLabel() {
    return label;
}
}