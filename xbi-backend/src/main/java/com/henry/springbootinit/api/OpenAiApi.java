package com.henry.springbootinit.api;


import java.util.HashMap;
import java.util.Map;

public class OpenAiApi {
    public static void main(String[] args) {
        String url = "https://api.openai.com/v1/chat/completions";
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("message", "");
    }
}
