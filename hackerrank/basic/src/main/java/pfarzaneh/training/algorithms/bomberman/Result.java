package pfarzaneh.training.algorithms.bomberman;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Result {

    public static List<String> bomberMan(int n, List<String> grid) {

        int index, r = grid.size();
        List<String> list = new ArrayList<>(grid);

        if (n == 1) return list;
        else if (n % 2 == 0)
            return list.stream().map(s -> s.replace('.', 'O')).collect(Collectors.toList());
        else n = (n % 4 == 3) ? 3 : 5;

        for (int t = 2; t <= n; t++)
            if (t % 2 == 0) for (int i = 0; i < r; i++) {
                list.set(i, list.get(i).replace('O', 'X'));
                list.set(i, list.get(i).replace('.', 'O'));
            }
            else for (int i = 0; i < r; i++)
                while (list.get(i).indexOf('X') >= 0) {
                    index = list.get(i).indexOf('X');
                    list.set(i, list.get(i).substring(0, index) + '.' + list.get(i).substring(index + 1));

                    if (index + 1 < list.get(i).length() && list.get(i).charAt(index + 1) == 'O')
                        list.set(i, list.get(i).substring(0, index + 1) + '.' + list.get(i).substring(index + 2));
                    if (index - 1 >= 0 && list.get(i).charAt(index - 1) == 'O')
                        list.set(i, list.get(i).substring(0, index - 1) + '.' + list.get(i).substring(index));
                    if (i - 1 >= 0 && list.get(i - 1).charAt(index) == 'O')
                        list.set(i - 1, list.get(i - 1).substring(0, index) + '.' + list.get(i - 1).substring(index + 1));
                    if (i + 1 < r && list.get(i + 1).charAt(index) == 'O')
                        list.set(i + 1, list.get(i + 1).substring(0, index) + '.' + list.get(i + 1).substring(index + 1));
                }

        return list;
    }

}
