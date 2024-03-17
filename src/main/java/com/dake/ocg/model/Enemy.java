package com.dake.ocg.model;

import java.util.List;

public record Enemy(int id, Life life, String name, List<Action> actions, List<Buff> buffs) {
}
