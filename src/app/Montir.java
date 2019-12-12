package app;


class Montir extends User{

    String Permasalahan;
    float point;
    
    String mengambilOrderan(){
        return "Mengambil Orderan";
    }
    String ChatDenganCustomer(){
        return "Melihat Jadwal";
    }
    String MelihatPoint(){
        return "Melihat Anggaran";
    }
    String MembatalkanOrderan(){
        return "kencel";
    }


}