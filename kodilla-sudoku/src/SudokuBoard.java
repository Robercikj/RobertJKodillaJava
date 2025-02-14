import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    public List<SudokuRow> rows;

  public SudokuBoard() {
      rows = new ArrayList<SudokuRow>();
      for(int i = 0; i < 9; i++){
          rows.add(new SudokuRow());
      }
  }
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();

      for(int i = 0;i < rows.size(); i++){
          for(int j = 0; j < 9; j++){
              sb.append(rows.get(i).getCell(j));
              if((j + 1 ) % 3 == 0 && j !=8) {
                  sb.append(" | ");
              } else {
                   sb.append(" ");
              }
          }
          sb.append("\n");

          if((i + 1) % 3 == 0 && i != 8){
              sb.append("-----+-----+-----\n");

          }
      }
      return sb.toString();
  }
}
