package edu.gui;

import java.awt.Graphics2D;

import edu.models.Block;

public interface BlockDrawer
{
	void drawBlock(Graphics2D g, Block block);
}
