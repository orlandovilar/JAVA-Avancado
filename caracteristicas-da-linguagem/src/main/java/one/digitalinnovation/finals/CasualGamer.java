package one.digitalinnovation.finals;

public class CasualGamer extends Gamer {

    @Override
    public String keyboard() {
        return "Simple keyboard...";
    }

    /**
     * @Override
     * public String mouse() {
     *     return super.mouse();
     * }
     */

    public String play(final String game) {
        //game = "LoL";
        return "Jogando " + game;
    }
}
