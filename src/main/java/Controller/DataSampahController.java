package Controller;

import Model.Sampah;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class DataSampahController implements Initializable {

    @FXML private TableView<Sampah> tabelSampah;
    @FXML private TableColumn<Sampah, String> kolomNama;
    @FXML private TableColumn<Sampah, String> kolomJenis;
    @FXML private TableColumn<Sampah, LocalDate> kolomTanggal;
    
    @FXML private TextField txtNama;
    @FXML private ComboBox<String> comboJenis;
    @FXML private DatePicker pickerTanggal;
    
    @FXML private Button btnTambah;
    @FXML private Button btnUpdate;
    @FXML private Button btnHapus;
    @FXML private Button btnBersihkan;

    private final ObservableList<Sampah> daftarSampah = FXCollections.observableArrayList();
    
    private Sampah sampahTerpilih = null;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        kolomNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        kolomJenis.setCellValueFactory(new PropertyValueFactory<>("jenis"));
        kolomTanggal.setCellValueFactory(new PropertyValueFactory<>("tanggal"));
        
        comboJenis.setItems(FXCollections.observableArrayList("Organik", "Anorganik", "B3"));
        
        tabelSampah.setItems(daftarSampah);
        
        tabelSampah.getSelectionModel().selectedItemProperty().addListener(
            (observable, oldValue, newValue) -> {
                if (newValue != null) {
                    sampahTerpilih = newValue;
                    
                    txtNama.setText(newValue.getNama());
                    comboJenis.setValue(newValue.getJenis());
                    pickerTanggal.setValue(newValue.getTanggal());
                }
            }
        );
    }

    @FXML
    void onTambahClick(ActionEvent event) {
        String nama = txtNama.getText();
        String jenis = comboJenis.getValue();
        LocalDate tanggal = pickerTanggal.getValue();
        
        if (!nama.isEmpty() && jenis != null && tanggal != null) {
            Sampah sampahBaru = new Sampah(nama, jenis, tanggal);
            daftarSampah.add(sampahBaru); 
            bersihkanForm();
        }
    }

    @FXML
    void onUpdateClick(ActionEvent event) {
        if (sampahTerpilih != null) {
            
            sampahTerpilih.setNama(txtNama.getText());
            sampahTerpilih.setJenis(comboJenis.getValue());
            sampahTerpilih.setTanggal(pickerTanggal.getValue());
            tabelSampah.refresh();
            bersihkanForm();
        }
    }

    @FXML
    void onHapusClick(ActionEvent event) {
        if (sampahTerpilih != null) {
            daftarSampah.remove(sampahTerpilih); 
            bersihkanForm();
        }
    }

    @FXML
    void onBersihkanClick(ActionEvent event) {
        bersihkanForm();
    }
    
    private void bersihkanForm() {
        txtNama.clear();
        comboJenis.setValue(null);
        pickerTanggal.setValue(null);
        sampahTerpilih = null;
        tabelSampah.getSelectionModel().clearSelection();
    }
}