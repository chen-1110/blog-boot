package com.chen.blogboot.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtils {
    public static String getCookie(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("userId")) {
                    return cookie.getValue();
                }
            }
        }
        String timeMillis = System.currentTimeMillis() + "";
        String randomNum = timeMillis.substring(timeMillis.length() - 6);
        Cookie cookie = new Cookie("userId", randomNum);
        cookie.setMaxAge(2147483647);
        response.addCookie(cookie);
        return cookie.getValue();
    }
}