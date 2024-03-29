package com.blackjack.client.ui;

import com.blackjack.shared.entities.Room;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.FlowPanel;

public class RoomSelectionPanel extends FlowPanel {

	private CheckBox difficultyCheckBox;
	private Room[] rooms;
	private RoomPanel[] roomPanels;
	
	public RoomSelectionPanel(Room[] rooms) {
		this.rooms = rooms;
		this.roomPanels = new RoomPanel[rooms.length];
		this.setStyleName("centered");
		this.setWidth("551px");
		
		FlowPanel roomPanelWrapper = new FlowPanel();
		roomPanelWrapper.setStyleName("roomSelectionPanel");
		roomPanelWrapper.setWidth("551px");
		
		FlowPanel optionsPanel = new FlowPanel();
		optionsPanel.setStylePrimaryName("modal");
		optionsPanel.addStyleDependentName("left");
		optionsPanel.addStyleDependentName("headerless");
		optionsPanel.setWidth("520px");
		
		difficultyCheckBox = new CheckBox("Easy Play (Both Dealer's cards are face up, earnings lowered.)");
		difficultyCheckBox.setStylePrimaryName("label");
		difficultyCheckBox.addStyleDependentName("white");
		
		int count = 0;
		for (Room room : rooms) {
			if (room != null) {
				RoomPanel roomPanel = new RoomPanel(room);
				roomPanelWrapper.add(roomPanel);
				roomPanels[count] = roomPanel;
				count++;
			}
		}
		
		
		optionsPanel.add(difficultyCheckBox);
		this.add(roomPanelWrapper);
		this.add(optionsPanel);
	}
	
	public void enableRoom(int atIndex, boolean enabled) {
		roomPanels[atIndex].enable(enabled);
	}

	/**
	 * @return the difficultyCheckBox
	 */
	public CheckBox getDifficultyCheckBox() {
		return difficultyCheckBox;
	}

	/**
	 * @param difficultyCheckBox the difficultyCheckBox to set
	 */
	public void setDifficultyCheckBox(CheckBox difficultyCheckBox) {
		this.difficultyCheckBox = difficultyCheckBox;
	}

	/**
	 * @return the rooms
	 */
	public Room[] getRooms() {
		return rooms;
	}

	/**
	 * @param rooms the rooms to set
	 */
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}

	/**
	 * @return the roomPanels
	 */
	public RoomPanel[] getRoomPanels() {
		return roomPanels;
	}

	/**
	 * @param roomPanels the roomPanels to set
	 */
	public void setRoomPanels(RoomPanel[] roomPanels) {
		this.roomPanels = roomPanels;
	}
	
	
	
}
