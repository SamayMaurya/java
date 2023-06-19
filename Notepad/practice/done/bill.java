class Bill {
    int unit;
    double total = 0;

    void set(int unit) {
        this.unit = unit;
    }

    void totalbill() {
        if (unit <= 100)
            total = unit * 0.6;
        else if (unit > 100 && unit <= 300)
            total = (100 * 0.6) + (unit - 100) * 0.8;
        else
            total = (100 * 0.6) + (200 * 0.8) + ((unit - 300) * 0.9);
        total += 50;
        if (total > 300)
            total = total + (0.15 * total);
    }

    void get() {
        System.out.println("Total Charges = " + total);
    }

    public static void main(String[] args) {
        Bill d = new Bill();
        int x = Integer.parseInt(args[0]);
        d.set(x);
        d.totalbill();
        d.get();
    }
}
