package com.microtech.common;

import java.util.HashMap;

public class MimeTypes {
    public static final String MIME_APPLICATION_JSON = "application/json";
    public static final String MIME_APPLICATION_ZIP = "application/zip";
    public static final String MIME_APPLICATION_X_GZIP = "application/x-gzip";
    public static final String MIME_APPLICATION_TGZ = "application/tgz";
    public static final String MIME_APPLICATION_MSWORD = "application/msword";
    public static final String MIME_APPLICATION_PDF = "application/pdf";
    public static final String MIME_APPLICATION_OCTET_STREAM = "application/octet-stream";
    public static final String MIME_APPLICATION_ODA = "application/oda";
    public static final String MIME_APPLICATION_JAVA_ARCHIVE = "application/java-archive";
    public static final String MIME_APPLICATION_VND_MSEXCEL = "application/vnd.ms-excel";
    public static final String MIME_APPLICATION_VND_MSPOWERPOINT = "application/vnd.ms-powerpoint";
    public static final String MIME_APPLICATION_X_JAVASCRIPT = "application/x-javascript";
    public static final String MIME_APPLICATION_X_LATEX = "application/x-latex";
    public static final String MIME_APPLICATION_X_SH = "application/x-sh";
    public static final String MIME_APPLICATION_X_TAR = "application/x-tar";
    public static final String MIME_APPLICATION_X_RAR_COMPRESSED = "application/x-rar-compressed";
    public static final String MIME_APPLICATION_XHTML_XML = "application/xhtml+xml";
    public static final String MIME_APPLICATION_XSLT_XML = "application/xslt+xml";
    public static final String MIME_APPLICATION_XML = "application/xml";
    public static final String MIME_APPLICATION_XML_DTD = "application/xml-dtd";
    public static final String MIME_IMAGE_GIF = "image/gif";
    public static final String MIME_IMAGE_JPEG = "image/jpeg";
    public static final String MIME_IMAGE_PNG = "image/png";
    public static final String MIME_TEXT_PLAIN = "text/plain";
    public static final String MIME_TEXT_RICHTEXT = "text/richtext";
    public static final String MIME_TEXT_RTF = "text/rtf";
    public static final String MIME_TEXT_HTML = "text/html";
    public static final String MIME_TEXT_CALENDAR = "text/calendar";
    public static final String MIME_TEXT_CSS = "text/css";
    private static HashMap<String, String> mimeTypeMapping;

    static {
        mimeTypeMapping = new HashMap<String, String>(200) {
            private void put1(String key, String value) {
                if (put(key, value) != null) {
                    throw new IllegalArgumentException("Duplicated extension: " + key);
                }
            }

            {
                put1("json", MIME_APPLICATION_JSON);
                put1("css", MIME_TEXT_CSS);
                put1("ifb", MIME_TEXT_CALENDAR);
                put1("ics", MIME_TEXT_CALENDAR);
                put1("dtd", MIME_APPLICATION_XML_DTD);
                put1("xsl", MIME_APPLICATION_XML);
                put1("xml", MIME_APPLICATION_XML);
                put1("xslt", MIME_APPLICATION_XSLT_XML);
                put1("xht", MIME_APPLICATION_XHTML_XML);
                put1("xhtml", MIME_APPLICATION_XHTML_XML);
                put1("sh", MIME_APPLICATION_X_SH);
                put1("latex", MIME_APPLICATION_X_LATEX);
                put1("js", MIME_APPLICATION_X_JAVASCRIPT);
                put1("ppt", MIME_APPLICATION_VND_MSPOWERPOINT);
                put1("oda", MIME_APPLICATION_ODA);
                put1("dmg", MIME_APPLICATION_OCTET_STREAM);
                put1("lzh", MIME_APPLICATION_OCTET_STREAM);
                put1("so", MIME_APPLICATION_OCTET_STREAM);
                put1("lha", MIME_APPLICATION_OCTET_STREAM);
                put1("dms", MIME_APPLICATION_OCTET_STREAM);
                put1("bin", MIME_APPLICATION_OCTET_STREAM);
                put1("txt", MIME_TEXT_PLAIN);
                put1("ini", MIME_TEXT_PLAIN);
                put1("c", MIME_TEXT_PLAIN);
                put1("h", MIME_TEXT_PLAIN);
                put1("cpp", MIME_TEXT_PLAIN);
                put1("cxx", MIME_TEXT_PLAIN);
                put1("cc", MIME_TEXT_PLAIN);
                put1("chh", MIME_TEXT_PLAIN);
                put1("java", MIME_TEXT_PLAIN);
                put1("csv", MIME_TEXT_PLAIN);
                put1("bat", MIME_TEXT_PLAIN);
                put1("cmd", MIME_TEXT_PLAIN);
                put1("asc", MIME_TEXT_PLAIN);
                put1("rtf", MIME_TEXT_RTF);
                put1("rtx", MIME_TEXT_RICHTEXT);
                put1("html", MIME_TEXT_HTML);
                put1("htm", MIME_TEXT_HTML);
                put1("zip", MIME_APPLICATION_ZIP);
                put1("rar", MIME_APPLICATION_X_RAR_COMPRESSED);
                put1("gzip", MIME_APPLICATION_X_GZIP);
                put1("gz", MIME_APPLICATION_X_GZIP);
                put1("tgz", MIME_APPLICATION_TGZ);
                put1("tar", MIME_APPLICATION_X_TAR);
                put1("gif", MIME_IMAGE_GIF);
                put1("jpeg", MIME_IMAGE_JPEG);
                put1("jpg", MIME_IMAGE_JPEG);
                put1("jpe", MIME_IMAGE_JPEG);
                put1("png", MIME_IMAGE_PNG);
                put1("doc", MIME_APPLICATION_MSWORD);
                put1("xls", MIME_APPLICATION_VND_MSEXCEL);
                put1("pdf", MIME_APPLICATION_PDF);
                put1("exe", MIME_APPLICATION_OCTET_STREAM);
                put1("dll", MIME_APPLICATION_OCTET_STREAM);
                put1("class", MIME_APPLICATION_OCTET_STREAM);
                put1("jar", MIME_APPLICATION_JAVA_ARCHIVE);
            }
        };
    }

    /**
     * Returns the corresponding MIME type to the given extension.
     * If no MIME type was found it returns 'application/octet-stream' type.
     */
    public static String getMimeType(String ext) {
        String mimeType = lookupMimeType(ext);
        if (mimeType == null) {
            mimeType = MIME_APPLICATION_OCTET_STREAM;
        }
        return mimeType;
    }

    /**
     * Simply returns MIME type or <code>null</code> if no type is found.
     */
    public static String lookupMimeType(String ext) {
        return mimeTypeMapping.get(ext.toLowerCase());
    }
}

