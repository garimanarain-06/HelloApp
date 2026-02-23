public class OopsBannerAppUC6 {

    public static String[] getO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    public static String[] getP() {
        return new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        };
    }

    public static String[] getS() {
        return new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }

    public static void main(String[] args) {

        String[] letterO = getO();
        String[] letterP = getP();
        String[] letterS = getS();

        int height = letterO.length;

        for (int i = 0; i < height; i++) {
            System.out.println(letterO[i] + "  " +
                               letterO[i] + "  " +
                               letterP[i] + "  " +
                               letterS[i]);
        }
    }
}