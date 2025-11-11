package Model;

import java.time.LocalDate;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Sampah {

    private final StringProperty nama;
    private final StringProperty jenis;
    private final ObjectProperty<LocalDate> tanggal; 

    public Sampah(String nama, String jenis, LocalDate tanggal) {
        this.nama = new SimpleStringProperty(nama);
        this.jenis = new SimpleStringProperty(jenis);
        this.tanggal = new SimpleObjectProperty<>(tanggal);
    }

    public String getNama() {
        return nama.get();
    }
    public void setNama(String value) {
        nama.set(value);
    }
    public StringProperty namaProperty() {
        return nama;
    }

    public String getJenis() {
        return jenis.get();
    }
    public void setJenis(String value) {
        jenis.set(value);
    }
    public StringProperty jenisProperty() {
        return jenis;
    }

    public LocalDate getTanggal() {
        return tanggal.get();
    }
    public void setTanggal(LocalDate value) {
        tanggal.set(value);
    }
    public ObjectProperty<LocalDate> tanggalProperty() {
        return tanggal;
    }
}