import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void testAddParents() {
        Person mother = new Person("Jade", "Doe", "female", 50);
        Person father = new Person("John", "Doe", "male", 45);
        Person child = new Person("Jane", "Doe", "female", 25);

        child.addParents(mother, father);

        assertEquals(mother, child.getMother());
        assertEquals(father, child.getFather());
    }

    @Test
    public void testAddChild() {
        Person parent = new Person("Parent", "Doe", "male", 50);
        Person child = new Person("Jane", "Doe", "female", 25);

        parent.addChild(child);

        assertTrue(parent.getChildren().contains(child));
        assertEquals(1, parent.getChildren().size());
    }

    @Test
    public void testAddPet() {
        Person owner = new Person("Joe", "Doe", "male", 75);
        Pet pet = new Pet("Simba", 5, "Cat");

        owner.addPet(pet);

        assertTrue(owner.getPets().contains(pet));
        assertEquals(1, owner.getPets().size());
    }

    @Test
    public void testAddSibling() {
        Person person = new Person("Jane", "Doe", "female", 25);
        Person sibling = new Person("Johnny", "Doe", "male", 18);

        person.addSibling(sibling);

        assertTrue(person.getSiblings().contains(sibling));
        assertEquals(1, person.getSiblings().size());
    }

    @Test
    public void testGetGrandChildren() {
        Person grandParent = new Person("Joe", "Doe", "male", 75);
        Person parent = new Person("John", "Doe", "male", 45);
        Person child = new Person("Jane", "Doe", "female", 25);

        grandParent.addChild(parent);
        parent.addChild(child);

        List<Person> grandChildren = grandParent.getGrandChildren();

        assertEquals(1, grandChildren.size());
        assertTrue(grandChildren.contains(child));
    }
}