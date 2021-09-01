package fi.spring.thymeleaf_project;

import java.util.ArrayList; 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import domain.Friend;

@Controller
public class FriendController {
	
	ArrayList<Friend> friends = new ArrayList<Friend>();
	

	@RequestMapping(value = "/friendz", method = RequestMethod.GET)
	public String showFriends(Model model) {
		model.addAttribute("friend", new Friend());
		return "friendz";
	}
	@RequestMapping(value = "/friendz", method = RequestMethod.POST)
	public String addFriend(@ModelAttribute Friend friend, Model model) {
		if (friend != null) {
			friends.add(friend);
		}
		model.addAttribute("friend", friend);
		model.addAttribute("friends", friends);
		return "friendz";
	}
}
