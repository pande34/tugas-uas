package app;



class Customer extends User{
    float Saldo;

    String MenginputPermasalahan(){
        return "Membuat Laporan";
    }
    String OrderMontir(){
        return "Menghapus Laporan";
    }
    String MelakukanChating(){
        return "Chat";
    }
    String MelihatSaldo(){
        return "cek saldo";
    }
    String MemberikanPoint(){
        return "memberikan Point";
    }
}