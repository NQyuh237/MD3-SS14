package bt.bt4;

class FootballTeam {
    private int Id;
    private String Name;
    private int numberOfPlayer;
    private int score;

    public FootballTeam(int Id, String Name, int numberOfPlayer, int score) {
        this.Id = Id;
        this.Name = Name;
        this.numberOfPlayer = numberOfPlayer;
        this.score = score;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}