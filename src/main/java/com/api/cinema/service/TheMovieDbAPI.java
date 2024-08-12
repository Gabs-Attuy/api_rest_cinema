package com.api.cinema.service;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TheMovieDbAPI {

    private static final OkHttpClient client = new OkHttpClient();
    private static final String API_KEY = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIxZWM2ZmJlY2VmNDMzOTM4OWZmMDU0NTAwOGYwYjc2MiIsIm5iZiI6MTcyMzM4ODUzNy43MDU5NTEsInN1YiI6IjY2YjhkMTgwMjM0ZjU0ZjY0N2JmYzIxYyIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.hPYpR-m_kFGdOVQd_3SkHF-MAbdigXyonZ7P_Yya-lc";
    private static final String BASE_URL = "https://api.themoviedb.org/3/discover/movie";

    public static String fetchMovieGenres() throws IOException {
        int numberOfPages = 3;
        StringBuilder results = new StringBuilder();

        for (int page = 1; page <= numberOfPages; page++) {
            // Construindo a URL com parâmetros
            HttpUrl url = HttpUrl.parse(BASE_URL)
                    .newBuilder()
                    .addQueryParameter("include_adult", "false")
                    .addQueryParameter("include_video", "false")
                    .addQueryParameter("language", "en")
                    .addQueryParameter("page", String.valueOf(page))
                    .addQueryParameter("sort_by", "popularity.desc")
                    .build();

            // Criando o pedido HTTP
            Request request = new Request.Builder()
                    .url(url)
                    .get()
                    .addHeader("Accept", "application/json")
                    .addHeader("Authorization", API_KEY)
                    .build();

            // Executando a solicitação e processando a resposta
            try (Response response = client.newCall(request).execute()) {
                if (!response.isSuccessful()) {
                    throw new IOException("Unexpected code " + response);
                }
                results.append(response.body().string());
            }
        }

        return results.toString();
        }
    }
