class Vehicle {
    private int jumlahRoda;
    private double harga;

    public Vehicle (){
        super();
        jumlahRoda = 0;
        harga = 0;
    }

    public Vehicle(int jumlahRoda, double harga) {
        super();
        this.jumlahRoda = jumlahRoda;
        this.harga = harga;
    }

    public double pakaidiskon(double persentasiDiskon){
        return harga - (harga * persentasiDiskon / 100);
    }
    
    public int getJumlahRoda() {
        return jumlahRoda;
    }
    
    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }

    public double getHarga() {
        return harga;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void print() {
        System.out.println("Jumlah Roda : " + jumlahRoda);
        System.out.println("Harga  : Rp." + harga);
    }

}