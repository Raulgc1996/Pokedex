package rgc.pokedex;

/**
 * Created by Raúl on 15/10/2016.
 */
public class Pokemon {
    private int icon;
    private  String name;
    private int image;
    private int numPoke;
    private String type1;
    private String type2;
    private String description;

    public Pokemon(int icon, String name, int image, int numPoke, String type1, String type2, String description) {
        this.icon = icon;
        this.name = name;
        this.image = image;
        this.numPoke = numPoke;
        this.type1 = type1;
        this.type2 = type2;
        this.description = description;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getNumPoke() {
        return numPoke;
    }

    public void setNumPoke(int numPoke) {
        this.numPoke = numPoke;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
