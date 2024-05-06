INSERT INTO matchbooking.player (id, version, created_at, created_by, updated_at, updated_by, deleted, active, first_name, last_name, email, phone, dob)
VALUES ('player_id_1', 1, '2024-05-05 00:00:00', 'admin', '2024-05-05 00:00:00', 'admin', false, true, 'John', 'Doe', 'john@example.com', '1234567890', '1990-01-01 00:00:00');

INSERT INTO matchbooking.player (id, version, created_at, created_by, updated_at, updated_by, deleted, active, first_name, last_name, email, phone, dob)
VALUES ('player_id_2', 1, '2024-05-06 00:00:00', 'admin', '2024-05-06 00:00:00', 'admin', false, true, 'Jane', 'Doe', 'jane@example.com', '9876543210', '1995-02-15 00:00:00');

INSERT INTO matchbooking.player_positions (player_id, positions)
VALUES ('player_id_1', 1);

INSERT INTO matchbooking.player_positions (player_id, positions)
VALUES ('player_id_2', 5);
use matchbooking;
INSERT INTO field_type (ID, name, capacity, price, VERSION, CREATED_AT, created_by, UPDATED_AT, updated_by, DELETED, ACTIVE)
VALUES
    ('field_type_id_1', 'Type 1', 100, 50.0, 1, '2024-05-05 00:00:00', 'admin', '2024-05-05 00:00:00', 'admin', false, true),
    ('field_type_id_2', 'Type 2', 150, 75.0, 1, '2024-05-05 00:00:00', 'admin', '2024-05-05 00:00:00', 'admin', false, true);

INSERT INTO field (ID, code, field_type_id, VERSION, CREATED_AT, created_by, UPDATED_AT, updated_by, DELETED, ACTIVE)
VALUES
    ('field_id_1', 123, 'field_type_id_1', 1, '2024-05-05 00:00:00', 'admin', '2024-05-05 00:00:00', 'admin', false, true),
    ('field_id_2', 456, 'field_type_id_2', 1, '2024-05-05 00:00:00', 'admin', '2024-05-05 00:00:00', 'admin', false, true);

