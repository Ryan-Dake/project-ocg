package com.dake.ocg.model;

import java.util.List;

public record Player(int id, Life life, Mana mana, List<Buff> buffs) {}
