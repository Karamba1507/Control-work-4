package com.company;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileService {

    private static final Gson gson=new GsonBuilder().setPrettyPrinting().create();
    private static final Path path=Paths.get("./cats.json");

    public List<Cat> readString() {
        String json;
        try {
            json=Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return gson.fromJson(json, new TypeToken<List<Cat>>(){}.getType());
    }
}

