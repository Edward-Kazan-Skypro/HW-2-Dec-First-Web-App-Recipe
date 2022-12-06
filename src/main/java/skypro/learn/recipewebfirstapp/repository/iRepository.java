package skypro.learn.recipewebfirstapp.repository;

import java.util.Map;

public interface iRepository<T> {
    //Добавление
    Map<Long, T> add(Long id, T t);

    //Поиск по id
    T findById(Long id);
}
