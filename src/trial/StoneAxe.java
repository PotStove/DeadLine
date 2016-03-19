package trial;

import org.springframework.stereotype.Component;

@Component
public class StoneAxe implements Axe {

    public StoneAxe() {
	System.out.println(
		"=====================stoneAxe=======================");
    }

    public String chop() {
	return "shitou";
    }
}
