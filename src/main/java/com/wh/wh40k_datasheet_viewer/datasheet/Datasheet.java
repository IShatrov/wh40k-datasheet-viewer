package com.wh.wh40k_datasheet_viewer.datasheet;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "wh40k_datasheets")
public class Datasheet {
    @Id
    @Column(name = "id")
    public String id;
    public String name;
    public String movement;
    public String toughness;
    public String armorSave;
    public String invulnerableSave;
    public String wounds;
    public String leadership;
    public String objectiveControl;
    public String baseSize;

    public Datasheet() {

    }

    public Datasheet(String id) {
        this.id = id;
    }

    public Datasheet(String id, String name, String movement, String toughness, String armorSave,
                     String invulnerableSave, String wounds, String leadership, String objectiveControl,
                     String baseSize) {
        this.id = id;
        this.name = name;
        this.movement = movement;
        this.toughness = toughness;
        this.armorSave = armorSave;
        this.invulnerableSave = invulnerableSave;
        this.wounds = wounds;
        this.leadership = leadership;
        this.objectiveControl = objectiveControl;
        this.baseSize = baseSize;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getMovement() {
        return this.movement;
    }

    public String getToughness() {
        return this.toughness;
    }

    public String getArmorSave() {
        return this.armorSave;
    }

    public String getInvulnerableSave() {
        return this.invulnerableSave;
    }

    public String getWounds() {
        return this.wounds;
    }

    public String getLeadership() {
        return this.leadership;
    }

    public String getObjectiveControl() {
        return this.objectiveControl;
    }

    public String getBaseSize() {
        return this.baseSize;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public void setArmorSave(String armorSave) {
        this.armorSave = armorSave;
    }

    public void setInvulnerableSave(String invulnerableSave) {
        this.invulnerableSave = invulnerableSave;
    }

    public void setWounds(String wounds) {
        this.wounds = wounds;
    }

    public void setLeadership(String leadership) {
        this.leadership = leadership;
    }

    public void setObjectiveControl(String objectiveControl) {
        this.objectiveControl = objectiveControl;
    }

    public void setBaseSize(String baseSize) {
        this.baseSize = baseSize;
    }
}
