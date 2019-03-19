package com.templeoftrust.api;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest-api/v1/nft")
public class NFTController {

    @RequestMapping(value = "/templeoftrust/{tokenSym}/{tokenId}", method = GET)
    public Map<String, Object> getErc20BoxMeta(@PathVariable String tokenSym, @PathVariable String tokenId) {
        Map<String, Object> meta = new HashMap<>();
        meta.put("description", "Temple of Trust token."
                + "Everybody wants it, but how to get one?");
        meta.put("image", "https://127.0.0.1/nft/tot/" + tokenSym + ".png");
        //meta.put("background_color", "#0e0e0e");
        meta.put("name", "Suske and Wiske");

        return meta;

    }

}
