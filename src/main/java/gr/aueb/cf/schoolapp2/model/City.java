package gr.aueb.cf.schoolapp2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class City {
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return name;
    }
}