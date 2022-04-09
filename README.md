# Task18_30
Задача 5.	Деревья
В некоторых вариантах данной задачи требуется реализовать дерево с количеством потомков больше 2-х. В этом случае для хранения в узле всех его потомков следует воспользоваться списком, можно стандартной реализаций (например, ArrayList<TreeNode<T>>), а еще лучше своей собственной реализацией связного списка (MyList<TreeNode<T>>). Ввод данных (построение дерева) имеет смысл сделать в виде разбора строки, описывающей дерево в скобочной нотации (разбиралась на лекции), но реализацию разбора потребуется чуть-чуть поправить для поддержки произвольного кол-ва потомков в узле. В этих задачах, вместо рисования дерева на форме можно распечатывать дерево (также может быть на форме - см. примеры) в следующем виде (слева представление дерева, справа пояснение, что это за дерево):
A
  AB1
    AB1C1
    AB1C2
  AB2
    AB2C1
      AB2C1D1
  AB3	

самый нижний – красным, а все промежуточные узлы – переходные от желтого к красному, в зависимости от глубины (уровня) узла (переход равномерный, т.е. второй уровень – почти желтый, середина – оранжевый, узлы на глубине – почти красные (при достаточной высоте дерева).	
Подсказка: необходимо модифицировать какое-то дерево в проекте TreeSamples так, чтобы его узлы содержали и возвращали цвет. Собственно алгоритм состоит из 2-х шагов: вначале найти высоту дерева, далее повторно обойти дерево, устанавливая для каждого узла цвет в соответствии с уровнем узла (пропорционально от желтого к красному).
