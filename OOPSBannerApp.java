
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
                String.join(" ", "  OOOO  ", " PPPP  ", " PPPP  ", " SSSS "),
                String.join(" ", " O    O ", " P   P ", " P   P ", " S    "),
                String.join(" ", " O    O ", " PPPP  ", " PPPP  ", " SSSS "),
                String.join(" ", " O    O ", " P     ", " P     ", "     S"),
                String.join(" ", "  OOOO  ", " P     ", " P     ", " SSSS ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
