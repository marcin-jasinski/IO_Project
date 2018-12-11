package main.java.pl.edu.pwr.io.lab.film;

import java.util.List;

public class Film {

    private enum FilmType {
        COMEDY, HORROR, THRILLER, SCIFI, ADVENTURE, DOCUMENTARY, NATURE;
    }

    private enum AgeCategory {
        FORALL(0), MIN12(12), MIN16(16), ADULT(18);

        private int value;
        private AgeCategory(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private String title;
    private String originalTitle;
    private FilmType filmType;
    private int productionYear;
    private String country;
    private String director;
    private AgeCategory ageCategory;
    private List<FilmItem> filmItemList;

    public Film(String title,
                String originalTitle,
                FilmType filmType,
                int productionYear,
                String country,
                String director,
                AgeCategory ageCategory) {

        this.title = title;
        this.originalTitle = originalTitle;
        this.filmType = filmType;
        this.productionYear = productionYear;
        this.country = country;
        this.director = director;
        this.ageCategory = ageCategory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public FilmType getFilmType() {
        return filmType;
    }

    public void setFilmType(FilmType filmType) {
        this.filmType = filmType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public AgeCategory getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(AgeCategory ageCategory) {
        this.ageCategory = ageCategory;
    }

    public List<FilmItem> getFilmItemList() {
        return filmItemList;
    }

    public void setFilmItemList(List<FilmItem> filmItemList) {
        this.filmItemList = filmItemList;
    }
}
