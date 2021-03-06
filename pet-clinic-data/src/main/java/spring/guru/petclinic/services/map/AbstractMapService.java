package spring.guru.petclinic.services.map;


import spring.guru.petclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){
        if(object != null){
            if(object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }else {
            throw new RuntimeException("Null Object Exception");
        }

        return object;
    }

    List<T> save(List<T> objects){
        objects.forEach(object->{
            if(object != null){
                if(object.getId() == null){
                    object.setId(getNextId());
                }
                map.put(object.getId(), object);
            }else {
                throw new RuntimeException("Null Object Exception");
            }
        });

        return objects;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }

    private Long getNextId(){
      Long nextId;

      try{
        nextId = Collections.max(map.keySet()) + 1;
      }catch (NoSuchElementException e){
            nextId = 0L;
      }

      return nextId;
    }
}
