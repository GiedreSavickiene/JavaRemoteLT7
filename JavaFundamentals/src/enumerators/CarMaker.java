package enumerators;

public enum CarMaker {
    BMV("bymer", 1850),
    VOLVO("volvo", 2020),
    MB("mercedes-benz", 1920);

    final String fullName;
    final int established;

    CarMaker(String fullName, int established){
        this.fullName = fullName;
        this.established = established;
    }
}
