package trial;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("chinese2")
public class Chinese {

    @Resource(name = "stoneAxe")
    private Axe axe;

    public Chinese() {
	System.out.println("=============chinese2=================");
    }

    public Chinese(Axe axe) {
	this.axe = axe;
    }

    // @Autowired
    public void setAxe(Axe axe) {
	this.axe = axe;
    }

    public void useAxe() {
	System.out.println(axe.chop());
    }
}
