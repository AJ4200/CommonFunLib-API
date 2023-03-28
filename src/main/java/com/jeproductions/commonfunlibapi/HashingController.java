package com.jeproductions.commonfunlibapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jeproductions.commonfunlibapi.Lib.Hashing;
import com.jeproductions.commonfunlibapi.Models.HashingModel;

@RestController

public class HashingController {
    
    @GetMapping("/hash")
    public HashingModel hash(@RequestParam("type") String type, @RequestParam("input") String input) {
        String hash = "";
        switch (type) {
            case "md5":
                hash = Hashing.md5(input);
                break;
            case "sha1":
                hash = Hashing.sha1(input);
                break;
            case "sha256":
                hash = Hashing.sha256(input);
                break;
            case "sha512":
                hash = Hashing.sha512(input);
                break;
            default:
                throw new IllegalArgumentException("Invalid hash type: " + type);
        }
        return new HashingModel(hash);
    }
}
