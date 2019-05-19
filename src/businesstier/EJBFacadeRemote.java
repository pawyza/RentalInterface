/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesstier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author User
 */
@Remote
public interface EJBFacadeRemote {
           
           
    public String addReservation(String[] data1, String[] data2, int number, LocalDate dateStart, LocalDate dateEnd);
    public String addClient(String data[]);
    public ArrayList<String> addRecord(String[] data1, String[] data2);
    public String addTitleRecord(String[] data);
    public List<String> getClientsModelString();
    public List<String> getTitleRecordsModelString();
    public List<String> getReservationModelString();
    public List<String> getRecordsModelString();
    public List<String[]> getTitleRecordStrings();
    public List<String[]> getRecordStrings();
    public List<String[]> getReservationStrings();
    public List<String[]> getClientStrings();
    public void deleteReservation(int number);
    public void deleteTitleRecord(String id);
    public void deleteRecord(int number);
    public void deleteClient(int number);
    public String[] transformTittleRecordToString(int index);
    public int transformClientIndexToNumber(int index);
    public int transformReservationIndexToNumber(int index);
    public String transformTitleRecordIndexToString(int index);
}
