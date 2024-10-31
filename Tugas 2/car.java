class car extends Vehicle {
    int jumlahPintu;
    boolean iniListrik;

    public car(int berapaRoda, double harga, int jumlahPintu, boolean iniListrik) {
        super(berapaRoda, harga);
        this.jumlahPintu = jumlahPintu;
        this.iniListrik = iniListrik;
    }

    public int getjumlahPintu() {
        return jumlahPintu;
    }

    public void setjumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public boolean isIniListrik() {
        return iniListrik;
    }

    public void setIniListrik(boolean iniListrik) {
        this.iniListrik = iniListrik;
    }

    @Override
    public void print () {
        super.print();
        System.out.println("Berapa Pintu :" + jumlahPintu);
        System.out.println("Ini Listrik :" + iniListrik);
    }
}