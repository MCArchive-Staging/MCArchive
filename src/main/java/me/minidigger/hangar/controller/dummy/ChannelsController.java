package me.minidigger.hangar.controller.dummy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import me.minidigger.hangar.controller.HangarController;

@Controller
public class ChannelsController extends HangarController {

    @GetMapping("/{author}/{slug}/channels")
    public Object showList(@PathVariable Object author, @PathVariable Object slug) {
        return null; // TODO implement showList request controller
    }

    @PostMapping("/{author}/{slug}/channels")
    public Object create(@PathVariable Object author, @PathVariable Object slug) {
        return null; // TODO implement create request controller
    }

    @PostMapping("/{author}/{slug}/channels/{channel}")
    public Object save(@PathVariable Object author, @PathVariable Object slug, @PathVariable Object channel) {
        return null; // TODO implement save request controller
    }

    @PostMapping("/{author}/{slug}/channels/{channel}/delete")
    public Object delete(@PathVariable Object author, @PathVariable Object slug, @PathVariable Object channel) {
        return null; // TODO implement delete request controller
    }

}

