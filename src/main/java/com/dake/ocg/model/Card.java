package com.dake.ocg.model;

import java.util.List;

public record Card(int cardId, String name, int cost, List<Action> actions) {}