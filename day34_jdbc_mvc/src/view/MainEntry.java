package view;

import java.io.IOException;
import java.sql.SQLException;

import controller.GiftController;

public class MainEntry {
	public static void main(String[] args) throws SQLException, IOException {
		GiftController.connect();
		GiftController.menu();
	}
}
