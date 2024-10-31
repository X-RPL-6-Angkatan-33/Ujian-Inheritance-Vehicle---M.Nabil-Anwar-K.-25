

class convertible extends car {
    private String tipeAtap;

    public convertible(String  tipeAtap ,int berapaRoda, double harga, int jumlahPintu, boolean iniListrik) {
        super(berapaRoda, harga, jumlahPintu, iniListrik);
        this.tipeAtap = tipeAtap;
    }

    public String  getTipeAtap() {
        return tipeAtap;
    }

    public void setTipeAtap(String  tipeAtap) {
        this.tipeAtap = tipeAtap;
    }

    @Override
    public void print (){
        super.print();
        System.out.println("Tipe Atap : " + tipeAtap);
    }
        
}
