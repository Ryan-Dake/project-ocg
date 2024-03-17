package com.dake.ocg.model;

import java.util.List;

public record Scenario(int id, String name, List<Enemy> enemies) {}
