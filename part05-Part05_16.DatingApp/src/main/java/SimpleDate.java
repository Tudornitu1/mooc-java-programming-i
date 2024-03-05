
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        if (this.day < 30) {
            this.day++;
        } else if (this.month < 12) {
            this.month++;
            this.day = 1;
        } else {
            this.year++;
            this.month = 1;
            this.day = 1;
        }
    }

    public void advance(int howManyDays) {
        if (this.day + howManyDays <= 30) {
            this.day += howManyDays;
        } else if (this.month + howManyDays / 30 + 1 < 12) {
            this.month += howManyDays / 30+1;
            this.day = this.day+howManyDays % 30-30;
        } else {
            this.year += howManyDays / 360 + 1;
            this.month = howManyDays / 12 + 1;
            this.day = howManyDays % 30;
        }

    }

    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(day, month, year);
        newDate.advance(days);
        return newDate;
        
    }

}
