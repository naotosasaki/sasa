package com.company;

class AcAdapter extends JapaneseConsent
        implements Dengen { // Adapter
     public int kyuuden() {
         return (int)(power() * 0.16);
     }
}