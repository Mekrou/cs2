public class BlueRayDisk {
    public String title;
    public String director;
    public int releaseDate;
    public double cost;

    public BlueRayDisk(String title, String director, int releaseDate, double cost)
    {
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.cost = cost;
    }

    public String toString()
    {
        return "$" + cost + " " + releaseDate + " " + title + ", " + director;
    }
}
